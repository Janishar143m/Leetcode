class Solution {
    char[][] pos=new char[3][3];
    
    public boolean xStatus(int i,int j,char X)
    {
        int k=0,ct=0;
        //xWin=true;
        //Check for row
        for(k=0;k<3;k++)
            if(pos[i][k]==X)
            {
                ct++;
            }
        if(ct==3)
            return true;
        ct=0;
        //Check for column
        for(k=0;k<3;k++)
            if(pos[k][j]==X)
                ct++;
        if(ct==3)
            return true;
        ct=0;
        //Check for diagonals
        for(k=0;k<3;k++)
        {
            if(pos[k][k]==X)
                ct++;
        }
         if(ct==3)
            return true;
        ct=0;
        //Check for backward diagonals
        for(k=0;k<=2;k++)
        {
            if(pos[k][2-k]==X)
                ct++;
        }
        
        if(ct==3)
         return true;
        else
            return false;
    }
    public boolean validTicTacToe(String[] board) {
        int countX=0,countO=0;
        boolean xWin=false,yWin=false;
        for(int i=0;i<3;i++)
        {
            String s=board[i];

                for (int j = 0; j < 3; j++) {
                    pos[i][j] = s.charAt(j);
                    if (pos[i][j] == 'X') {
                        countX++;
                        if(!xWin)
                        {
                            xWin = xStatus(i, j,'X');
                        }
                    } else if (pos[i][j] == 'O')
                    {
                        countO++;
                        if(!yWin)
                        {
                            yWin = xStatus(i, j,'O');
                        }
                  }
            }
        }     

       

        if(countX==0 && countO==0)
            return true;
        else if(countX==countO && xWin==false && yWin==false)
            return true;
        else if(countX==countO+1 && yWin==false)
            return true;
          else if(countX==countO && xWin==false && yWin==true)
            return true;    
        else
            return false;
   
}
}    