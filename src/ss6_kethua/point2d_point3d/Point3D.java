package ss6_kethua.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(), getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + getX() +
                "y= " + getY() +
                "z= " + z +
                "arr = " + Arrays.toString(getXYZ()) +
                '}';
    }
}
