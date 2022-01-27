class Solution {
    public boolean validTicTacToe(String[] board) {
        int rows[]=new int[3];
        int cols[]=new int[3];
        int diag=0,antidiag=0,turn=0;
        boolean xWin=false,yWin=false;
        for(int i=0;i<3;i++)
        {
            char[] c=board[i].toCharArray();
            for(int j=0;j<3;j++)
            {
                if(c[j]=='X')
                {
                    rows[i]++;
                    cols[j]++;
                    turn++;
                }
                if(c[j]=='O')
                {
                    rows[i]--;
                    cols[j]--;
                    turn--;
                }
                if(i==j)
                {
                     if(c[j]=='X')
                        diag++;
                    else if(c[j]=='O')
                        diag--;   
                }  
                if(i+j==2)
                {
                    if(c[j]=='X')
                        antidiag++;
                    else if(c[j]=='O')
                        antidiag--;
                }
                    
            }
        }
        
        if(rows[0]==3||rows[1]==3||rows[2]==3||cols[0]==3||cols[1]==3||cols[2]==3||diag==3||antidiag==3)
            xWin=true;
  if(rows[0]==-3||rows[1]==-3||rows[2]==-3||cols[0]==-3||cols[1]==-3||cols[2]==-3||diag==-3||antidiag==-3)
            yWin=true;
 
if((xWin==true && yWin==false && turn==1)||(yWin==true && turn==0 && xWin==false))
    return true;
else if(xWin==false && yWin==false && (turn==0||turn==1))
    return true;
 else
     return false;
        
        
    }
}