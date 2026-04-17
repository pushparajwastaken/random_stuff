import java.util.ArrayList;

public class maze{
    public static void main(String[] args) {
        path("",3,3);
        System.out.println(pathList("", 3, 3));
        System.out.println(pathListDiag("", 3, 3));
    }
    static int count(int row,int column){
        if(row ==1 || column ==1){
            return 1;
        }
        int left=count(row-1,column);
        int right=count(row,column-1);
        return left+right;
    }
    static void path(String p,int r,int c){
      if(r ==1 && c ==1){
        System.out.println(p);
            return ;
        }
         if(r>1){
            path(p+'D',r-1,c);
         }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
   
    static ArrayList<String> pathList(String p,int r,int c){
      if(r ==1 && c ==1){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
    return list;
       }
       ArrayList<String> res=new ArrayList<>();
         if(r>1){
            res.addAll(pathList(p+'D',r-1,c));
         }
        if(c>1){
            res.addAll(pathList(p+'R',r,c-1));
        }
        return res;
    }
    static ArrayList<String> pathListDiag(String p,int r,int c){
      if(r ==1 && c ==1){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
    return list;
       }
       ArrayList<String> res=new ArrayList<>();
          if(r>1 && c>1){
            res.addAll(pathList(p+'d',r-1,c-1));
        }
         if(r>1){
            res.addAll(pathList(p+'D',r-1,c));
         }
        if(c>1){
            res.addAll(pathList(p+'R',r,c-1));
        }
     
        return res;
    }
    
      static ArrayList<String> pathListObs(String p,boolean[][]maze,int r,int c){
      if(r ==maze.length-1 && c ==maze[0].length-1){
        ArrayList<String>list=new ArrayList<>();
        list.add(p);
    return list;
       }
       if(maze[r][c]==false){
        return ;
       }
       ArrayList<String> res=new ArrayList<>();
       //when you land on a new cell,check whether it is river or not
       //if we land on river,stop recursion
         if(r<maze.length-1){
            res.addAll(pathListObs(p+'D',maze,r-1,c));
         }
        if(c<maze[0].length-1){
            res.addAll(pathListObs(p+'R',maze,r,c-1));
        }
        return res;
    }
}