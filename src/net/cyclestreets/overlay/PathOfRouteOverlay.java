package net.cyclestreets.overlay;

import org.osmdroid.ResourceProxy;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.overlay.PathOverlay;

public class PathOfRouteOverlay extends PathOverlay {
	static int PATH_COLOUR = 0x80ff0000;
	
	private GeoPoint start_;
		   
	public PathOfRouteOverlay(final ResourceProxy pResourceProxy)
	{
		super(PATH_COLOUR, pResourceProxy);
	    mPaint.setStrokeWidth(6.0f);
	} // MapActivityPathOverlay

	public GeoPoint pathStart() 
	{
		return start_;
	} // pathStart
	       
	public void clearPath()
	{
		super.clearPath();
		start_ = null;
	} // clearPath
	       
	public void addPoint(final GeoPoint pt)
	{
		if(start_ == null)
			start_ = pt;
		super.addPoint(pt);
	} // addPoint
	       
	public void addPoint(final int latitudeE6, final int longitudeE6) 
	{
		if(start_ == null)
			start_ = new GeoPoint(latitudeE6, longitudeE6);
		super.addPoint(latitudeE6, longitudeE6);
	} // addPoint
} // class PathOfRouteOverlay