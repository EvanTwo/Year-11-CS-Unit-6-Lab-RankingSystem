public class User {
    private int rank;
    private int progress;

    public User(){
        rank = -8;
        progress = 0;
    }

    public int getRank() {
        return rank;
    }

    public int getProgress() {
        return progress;
    }

   public void incProgress(int progress){
        int d = 0;
       if (progress > 8 || progress < -8 || progress == 0){
           throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
       }
        else {
           // If and else if statements to add progress to the user
             if (this.rank - progress == 1) {
               this.progress = this.progress + 1;
           } else if (this.rank == progress) {
               this.progress = this.progress + 3;
           } else if (this.rank < progress) {

                 if (progress >= 0){
                     d = progress - this.rank - 1;
                 }
                 else
                     d = progress - this.rank;

               this.progress = this.progress + (10 * d * d);
           }
        }
            boolean passZero = false;
           while (this.progress > 100 && this.rank <= 8) {

               if (this.rank == 0)
               {
                   passZero = true;
               }
               this.progress = this.progress - 100;
               this.rank++;

           }

           if (passZero || this.rank == 0){
               this.rank++;
           }

   }



    public String toString() {
        return "User{rank=" + this.rank + ", progress=" + this.progress + "}";
    }
}

