package PrettyRectangle;

class BoundingBoxFactory {



    public static MyPrettyRectangle getBoundingBox(MyPrettyRectangle[] rects) {
        if (rects == null) {
            return null;
        }
        if (rects.length == 0) {
            return new MyPrettyRectangle(0.0, 0.0, 0.0, 0.0);
        }

        double minX = Double.MAX_VALUE;
        double minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double maxY = Double.MIN_VALUE;

        for (MyPrettyRectangle rect : rects) {
            if (rect != null) {
                minX = Math.min(minX, rect.x1);
                minY = Math.min(minY, rect.y1);
                maxX = Math.max(maxX, rect.x2);
                maxY = Math.max(maxY, rect.y2);
            }
        }

        if (minX == Double.MAX_VALUE || minY == Double.MAX_VALUE || maxX == Double.MIN_VALUE || maxY == Double.MIN_VALUE) {

            return new MyPrettyRectangle(0.0, 0.0, 0.0, 0.0);
        }

        return new MyPrettyRectangle(minX, minY, maxX, maxY);
    }




}