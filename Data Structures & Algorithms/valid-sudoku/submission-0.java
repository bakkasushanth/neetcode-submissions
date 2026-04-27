class Solution {
    public boolean isValidSudoku(char[][] board) { 
        HashSet<Integer>[] rows = new HashSet[9];
    HashSet<Integer>[] cols = new HashSet[9];
    HashSet<Integer>[] boxes = new HashSet[9];
    for(int i = 0; i < 9; i++) {
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
    }
    for(int row = 0; row < 9; row++) {
        for(int col = 0; col < 9; col++) {
            char a = board[row][col];
            if(a == '.') continue; 
            int num = a - '0';
            int boxIndex = (row / 3) * 3 + (col / 3);
              if(rows[row].contains(num) || 
               cols[col].contains(num) || 
               boxes[boxIndex].contains(num)) {
                return false;
            }
            rows[row].add(num);
            cols[col].add(num);
            boxes[boxIndex].add(num);
        }
       
    }
    return true;
    
    }
}
