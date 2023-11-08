// Amy Gonzalez
// COP 3503C Spring 2023
// am890728
// RunLikeHell

public class RunLikeHell
{
    public static int maxGain(int[] blocks)
    {
        int i;
        // Initialize dynamic array to hold values
        int[] dynamic = {blocks[0], Math.max(blocks[0], blocks[1])};
        // If array is empty
        if (blocks.length == 0)
        {
            return 0;
        }
        if (blocks.length == 1)
        {
          return blocks[0];
        }

        // Iterate through array starting at position 2
        for (i = 2; i < blocks.length; i++)
        {
            // Holds value while we take max of the following values
            int tempVar = dynamic[1];
            dynamic[1] = Math.max(dynamic[0] + blocks[i], dynamic[1]);
            // Replaces older value with temp
            dynamic[0] = tempVar;
        }
        // Returns maximum knowledge value
        return dynamic[1];
    }

    public static double difficultyRating()
    {
        return 3.2;
    }

    public static double hoursSpent()
    {
        return 8.5;
    }
}
