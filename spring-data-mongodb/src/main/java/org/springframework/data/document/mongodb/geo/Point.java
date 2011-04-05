/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.document.mongodb.geo;

/**
 * Represents a geospatial point value
 * @author Mark Pollack
 *
 */
public class Point {

  private double latitude;
  
  private double longitude;

  public Point(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }
  
  public Point(Point point) {
    this.latitude = point.latitude;
    this.longitude = point.longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }
  
  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(latitude);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(longitude);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Point other = (Point) obj;
    if (Double.doubleToLongBits(latitude) != Double
        .doubleToLongBits(other.latitude))
      return false;
    if (Double.doubleToLongBits(longitude) != Double
        .doubleToLongBits(other.longitude))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Point [latitude=" + latitude + ", longitude=" + longitude + "]";
  }
  
  
  
  
}
