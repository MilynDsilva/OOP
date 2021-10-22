class callbyref{  

        
    public static void main(String args[]){  
        square s1= new square(); 
        s1.l=10;

        modify(s1);
        System.out.println(s1.l);
    }
    public static void modify(square s2) {
        s2.l=33;
        //System.out.println(s2.l);
    }  
   }  
   class square {
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




// class passbyval{  
//     int data=50;  
     
//     void change(int data){  
//     data=data+100;//changes will be in the local variable only  
//     System.out.println(data);
//     }  
        
//     public static void main(String args[]){  
//         passbyval op=new passbyval();  //instantiate
     
//       System.out.println("before change "+op.data);  
//       op.change(500);  
//       System.out.println("after change "+op.data);  
     
//     }  
//    }  