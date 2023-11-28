package com.example.beautifulworld;

public class RowModelList {
   int ImageView;
   String places,city;

   public RowModelList(int imageView, String places, String city) {
      ImageView = imageView;
      this.places = places;
      this.city = city;
   }

   public int getImageView() {
      return ImageView;
   }

   public void setImageView(int imageView) {
      ImageView = imageView;
   }

   public String getPlaces() {
      return places;
   }

   public void setPlaces(String places) {
      this.places = places;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }
}
