public class towersOfHanoi {
    public static void main(String[]args) {
        int n = 3;
        shiftDisk(n,'A','B', 'C');
    }

    public static void shiftDisk(int n, char A, char B, char C) {
        if ( n ==1 ) {
            System.out.println("Disk shifted from" + A + " to" + B);
        }
        else {
            shiftDisk(n-1, A, C, B); {
                System.out.println("Disk shifted from" + A + " to" + B);
                shiftDisk(n-1, B, A, C);
            }
        }
    }
}

// Output:
// Disk shifted fromA toB
// Disk shifted fromA toC
// Disk shifted fromC toA
// Disk shifted fromA toB
// Disk shifted fromB toC
//n Disk shifted fromB toA
// Disk shifted fromA toB
