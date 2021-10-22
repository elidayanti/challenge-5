class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Elida", 20, 155);
      hero.profile();
      
  
      // jalankan aktivitas disini...
  
      // contoh:
      hero.jalan();
      hero.jalan();
      hero.jalan();
      hero.jalan();
      hero.jalan();
      
      hero.lari();
      hero.lari();
      
      hero.makan();
      hero.makan();
      hero.makan();

      hero.minum();

      hero.lompat();
      hero.lompat();
      hero.lompat();

      hero.duduk();
      
      // tampilan status terkini...
        hero.profile();

    }
}