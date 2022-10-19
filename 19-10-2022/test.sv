//21BCP293
module tb_segment7;
  reg [3:0] bcd;
  wire [6:0] seg;
  integer i;
  
  segment7 uut(
    .bcd(bcd),
    .seg(seg)
  );
  initial begin
    for(i = 0;i<10; i= i+10)
      begin
        bcd = i;
        #10
        $dispaly("%b", seg);
      end
  end
  initial 
   begin
     $dumpfile("dump.vcd")
     $dumpvars(1)
   end
endmodule