//21BCP293

module HA(input a,b,output sum,carry);
  wire a_not,b_not,x,y,w;
  nor(a_not,a);
  nor(b_not,b);
  nor(x,a,b_not);
  nor(y,a_not,b);
  nor(w,x,y);
  nor(sum,w);                        // sum calculated
  nor(carry,a_not,b_not);            //carry calculated
endmodule




//21BCP293
module tb_FA;
  reg A,B;
  wire SUM,CARRY;
  HA f1(A,B,SUM,CARRY);
 
  initial 
    begin
      A=0;B=0; #1;
      $display("a=%b and b=%b",A,B);
      $display("c=%b",CARRY);
      $display("s=%b",SUM);
      
      A=0;B=1; #1;
      $display("a=%b and b=%b",A,B);
      $display("c=%b",CARRY);
      $display("s=%b",SUM);
     
      A=1;B=0; #1;
      $display("a=%b and b=%b",A,B);
      $display("c=%b",CARRY);
      $display("s=%b",SUM);
      
      A=1;B=1; #1;
      $display("a=%b and b=%b",A,B);
      $display("c=%b",CARRY);
      $display("s=%b",SUM);
    end
   
  initial 
  	begin
      $dumpfile("dump.vcd");
      $dumpvars(1);
    end
endmodule

      


