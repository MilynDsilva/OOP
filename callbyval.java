class callbyval{  

        
    public static void main(String args[]){  
        
        int s1=10;

        modify(s1);
        System.out.println(s1);
    }
    public static void modify(int s2) {
        s2=33;
       // System.out.println(s2);
    }  
   }  
   class square1 {
       float l;
       float b;
       
           public float getl() {
                return l;
           }
           public void setl(float l) {
                this.l=l;
           }
           public float getb() {
            return b;
        }
        public void setb(float b) {
            this.b=b;
        
       }

    }