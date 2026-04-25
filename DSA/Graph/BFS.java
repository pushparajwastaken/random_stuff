import java.util.ArrayList;
import java.util.Queue;

public class BFS {
    static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new  boolean[v];
        Queue <Integer> q=new ArrayList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for(Integer it: adj.get(node)){
                if(vis[it]==false){
                    visit[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
