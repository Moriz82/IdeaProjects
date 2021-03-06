import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        double[][] table = new double[5][6];
        System.out.println(checkIndexes(table, 4, 5));
    }
    public static boolean checkIndexes(double[][] data, int row, int col)

    {

        int numRows = data.length;

        if (row < numRows)

        {

            int numCols = data[0].length;

            return col < numCols;

        }

        else

        {

            return false;

        }

    }

}
 class Block
{
    //instance variables not shown
    public Block() 	  			{    }
        public int getWidth() 			{ return 0;   }

            public int getHeight()			{   return 0; }

                public void setWidth( int width ) 	{    }

                    public void setHeight( int height)	{    }
//other methods not shown
                    }

class Row
{
    private ArrayList<Block> myBlocks;   //contains all Block
    public Row() 	  						{  }

    public int blockCount( int width, int height){
        int amount = 0;
        for (Block block : myBlocks) {
            if (block.getWidth() == width && block.getHeight() == height){
                amount++;
            }
        }
        return amount;
    }

    private Block tallestBlock(){
        int height = Integer.MIN_VALUE;
        Block _block = null;

        for (Block block : myBlocks) {
            if (block.getHeight() > height){
                height = block.getHeight();
                _block = block;
            }
        }
        return _block;
    }
    public void level(){
        Block tallestBlock = tallestBlock();

        for (Block block : myBlocks) {
            if (block.getHeight() < tallestBlock.getHeight()){
                block.setHeight(tallestBlock.getHeight());
            }
        }
    }
//other public member methods not shown
}
