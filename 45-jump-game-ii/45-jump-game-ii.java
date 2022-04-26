class Solution {

    public int jump(int[] a) {
        int n = a.length;

        // Check Base Conditions
        if (n == 0 || n == 1) {
            return 0;
        } else if (a[0] >= n - 1) {
            return 1;
        }

        // Keeps count of number of jumps
        int count = 1;

        // 2 pointers to loop through the array
        int current_pos = 0; // stores the current position
        int parsed_pos = -1; // stores the last index of the position that have been parsed

        //stores the position of the max value one can jump to between the parsed position and the current position
        int jumpTo = current_pos + a[current_pos];

        // while not reached destination/end
        while (jumpTo < n - 1) {
            int arr[] = nextJump(a, current_pos, parsed_pos);
            current_pos = arr[0];
            parsed_pos = arr[1];
            jumpTo = arr[2];
            count += 1;
        }

        return count;
    }

    //finds the best index to jump from, between parsed_pos and max index reachable from current_pos
    static int[] nextJump(int[] a, int current_pos, int parsed_pos) {
        // stores the best position to jump from, between parsed_pos and max index reachable from current_pos 
        int new_pos = current_pos;

        // iterate parsed_pos and max index reachable from current_pos and find the index that can jump the farthest and set that as new_pos
        for (int i = parsed_pos + 1; i <= current_pos + a[current_pos]; i++) {
            if (i + a[i] >= new_pos + a[new_pos]) {
                new_pos = i;
            }
        }

        //contains the new position to jump to, last index parsed in this iteration(new parsed_pos), maximum index reachable from the new position 
        int arr[] = { new_pos, current_pos + a[current_pos], new_pos + a[new_pos] };
        return arr;
    }
}