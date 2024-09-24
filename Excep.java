// Importing necessary packages for file handling, SQL, and exceptions
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Excep
{
    public static void main(String[] args)
    {
        // Unchecked Exceptions (Runtime Exceptions)

        try
        {
            // Unchecked Exception: Division by zero causes ArithmeticException
            int n = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("\n\t\t-------------Unchecked Exceptions---------------");
            System.out.println("\nArithmetic Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Unchecked Exception: Accessing an invalid array index causes ArrayIndexOutOfBoundsException
            int arr[] = new int[5];
            arr[7] = 100; // Index 7 is out of bounds, array size is only 5
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nArray Index Out of Bounds Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Unchecked Exception: Null reference causes NullPointerException
            String str = null;
            int len = str.length(); // Attempting to get length of a null string
        }
        catch (NullPointerException e)
        {
            System.out.println("\nNull Pointer Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Unchecked Exception: Illegal argument passed causes IllegalArgumentException
            throw new IllegalArgumentException("This is an IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("\nIllegal Argument Exception Occurred: " + e.getMessage());
        }

        // Checked Exceptions (Compile-time Exceptions)
        System.out.println("\n\t\t-------------Checked Exceptions---------------");

        try
        {
            // Checked Exception: FileNotFoundException
            // Simulating file not found scenario
            throw new FileNotFoundException("File not found!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nFile Not Found Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Checked Exception: IOException
            // Simulating an I/O error scenario
            throw new IOException("Simulated IOException");
        }
        catch (IOException e)
        {
            System.out.println("\nIO Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Checked Exception: SQLException
            // Simulating an SQL error
            throw new SQLException("Simulated SQLException");
        }
        catch (SQLException e)
        {
            System.out.println("\nSQL Exception Occurred: " + e.getMessage());
        }

        try
        {
            // Checked Exception: ClassNotFoundException
            // Attempting to load a class that doesn't exist
            Class.forName("com.example.NonExistentClass");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("\nClass Not Found Exception Occurred: " + e.getMessage());
        }
    }
}
