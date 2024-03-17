package renderer;

import primitives.Color;
import primitives.Ray;
import scene.Scene;

import java.util.List;

/**
 * abstract class for trace Ray
 * @author Yoav Uzan and Yaniv BarTov
 */
public abstract class RayTracerBase {
    protected final Scene scene;

    /**
     * Constructor with scene parameter
     * @param sc the scene to trace through
     */
    public RayTracerBase(Scene sc) {
        scene = sc;
    }

    /**
     * The function finds GeoPoint points intersections of the ray
     * with the scene objects and returns the color of the closest intersection
     *
     * @param ray to trace
     * @return Color - the color of the intersection point
     */

    public abstract Color traceRay(Ray ray);	//abstract method for trace ray

    /**
     * abstract method for trace ray by antiAliasing method.
     * get list of rays to pixel and calculate the average color of this pixel
     * @param rays- list of rays to certain pixel
     * @return the average color of this pixel
     */
    public abstract Color traceRays(List<Ray> rays);
}
