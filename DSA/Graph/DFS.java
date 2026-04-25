public class DFS{

    
public function dfsRec(adj, visited, s, res) {
    visited[s] = true;
    res.push(s);

    // Recursively visit all adjacent vertices 
    // that are not visited yet
    for (let i of adj[s]) {
        if (!visited[i]) {
            dfsRec(adj, visited, i, res);
        }
    }
}

function dfs(adj) {
    const visited = new Array(adj.length).fill(false);
    const res = [];
    dfsRec(adj, visited, 0, res);
    return res;
}


function addEdge(adj, u, v) {
    adj[u].push(v);
    adj[v].push(u);
}

// Driver code

let V = 5;
let adj = [];

// creating adjacency list
for (let i = 0; i < V; i++)
    adj.push([]);

addEdge(adj, 1, 2);
addEdge(adj, 1, 0);
addEdge(adj, 2, 0);
addEdge(adj, 2, 3);
addEdge(adj, 2, 4);

// Perform DFS starting from vertex 0
const res = dfs(adj);

for (let i = 0; i < res.length; i++) {
    process.stdout.write(res[i] + " ");
} {
    
}

}