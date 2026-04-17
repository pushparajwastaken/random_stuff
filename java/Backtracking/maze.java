package java.Backtracking;

import java.util.ArrayList;

public class maze {
     static ArrayList<String> allPath(String p,boolean[][]maze,int r,int c){
      if(r ==maze.length-1 && c ==maze[0].length-1){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
    return list;
       }
       if(maze[r][c]==false){
        return ;
       }
       ArrayList<String> res=new ArrayList<>();
       //to stop multiple recursion calls made we will mark the cells we have visited as false
maze[r][c]=false;
//bbut we have to undo it also once,that path is over so it doesn't block the cell for other paths
//while we move back,we restore it the way it was    
if(r<maze.length-1){
    
            res.addAll(allPath(p+'D',maze,r+1,c));
           
         }
        if(c<maze[0].length-1){
            res.addAll(allPath(p+'R',maze,r,c+1));
        }
        if(r>0){
            res.addAll(allPath(p+'U',maze,r-1,c));
        }
        if(c>0){
            res.addAll(allPath(p+'L',maze,r,c-1));
        }
        //this line is where the function will be over
        //so before the function gets removed ,alos remove the changes that were made by that function
        maze[r][c]=true;
        return res;
    }
}
