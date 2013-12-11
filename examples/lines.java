//
// Write the code to draw a symmetrical letter W with 4 line segments.  
// Start the upper left hand corner at (0,0) 
// The total width will be 40 and the height will be 30.
// The Drawing should look like this:
// http://i.imgur.com/kIwzrNn.png
//
// Check out the video segment "Draw a Crate" for inspiration
// https://www.udacity.com/course/viewer#!/c-cs046/l-161445800/e-177304176/m-177304177
//
// line(x1, x2, y1, y2)
//
public class WViewer
{
   public static void main(String[] args)
   {
       // TODO: Write the code to draw a symmetrical letter W with 4 line segments.
       Line line1 = new Line( 0, 0, 10, 30 );
       Line line2 = new Line( 10, 30, 20, 0 );
       Line line3 = new Line( 20, 0, 30, 30 );
       Line line4 = new Line( 30, 30, 40, 0 );
  
       line1.draw();
       line2.draw();
       line3.draw();
       line4.draw();
   }
}