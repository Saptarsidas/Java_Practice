/*  Build an interface MusicPlayer with methods play() and stop().
 Implement classes MP3Player and CDPlayer that implement the MusicPlayer interface. 
 Override the methods to simulate playing and stopping. */
 interface MusicPlayer{
    void play();
    void stop();
 }
 class MP3Player implements MusicPlayer{
    public void play(){
    System.out.println("Musing is playing by mp3 player");
    }
    public void stop(){
    System.out.println("Musing is stopped by mp3 player");
     }
}
class CDPlayer implements MusicPlayer{
   public void play(){
   System.out.println("Musing is playing by cdplayer");
   }
   public void stop(){
   System.out.println("Musing is stopped by cd player");
   }
}
class Music{
    public static void main(String[] args){
       MP3Player m1=new MP3Player();
       m1.play();
       m1.stop();
       CDPlayer c1=new CDPlayer();
       c1.play();
       c1.stop();
    }
}
