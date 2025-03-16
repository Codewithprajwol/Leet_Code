// See https://aka.ms/new-console-template for more information
using System;

namespace ArrayQuestion{

    class Program{
  //[0,12, 1,3,0,4]
        public static void ZeroAtlast(int [] data){
           int initialPostion=0;

            for(int i=0;i<data.Length;i++){
                if(data[i]!=0){
                    data[initialPostion]=data[i];
                    initialPostion++;
                }
            }
            while(initialPostion<data.Length){
                data[initialPostion++]=0;
            }

              Console.WriteLine($"Final answer is: [{string.Join(", ", data)}]");
        }
    static void Main(string [] args){
       Program.ZeroAtlast([0,12, 1,3,0,4]);
    }
    }
}