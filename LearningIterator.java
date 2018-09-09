package learningiterator;

/** Learning Iterator
 *
 * This program simulates the iteration in learning process.
 * 
 * @author Haixuan Huang
 * 
 * @version 09/09/2018
 * 
 */
public class LearningIterator 
{
    public static void main(String[] args) 
    {
        final double MEMORY_COEFFICIENT = 0.6;
        double contentToMemorize = 1;
        final int numIteration = 5;
        double contentMemorized = 0;
        for(int i = 0; i < numIteration; i++)
        {
            contentMemorized += MEMORY_COEFFICIENT * contentToMemorize;
            contentToMemorize = 1 - contentMemorized;
            System.out.println("After " + (i+1) + " iteration(s), "
                    + "the proportion of content memorized is " + contentMemorized
                    + ".");
        }   
    }  
}
