#include <iostream>
#include <queue>
#include <vector>

using namespace std;

class Graph
{
    int vertices;
    vector<vector<int>> adjacencyMatrix;

public:
    Graph(int V)
    {
        vertices = V;
        adjacencyMatrix.resize(vertices, vector<int>(vertices, 0));
    }

    void addEdge(int source, int destination)
    {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    void bfsTraversal(int startVertex)
    {
        vector<bool> visited(vertices, false);
        queue<int> q;

        visited[startVertex] = true;
        q.push(startVertex);

        while (!q.empty())
        {
            int currentVertex = q.front();
            q.pop();
            cout << currentVertex << " ";

            for (int neighbor = 0; neighbor < vertices; neighbor++)
            {
                if (adjacencyMatrix[currentVertex][neighbor] == 1 && !visited[neighbor])
                {
                    visited[neighbor] = true;
                    q.push(neighbor);
                }
            }
        }
    }

    void dfsTraversal(int startVertex)
    {
        vector<bool> visited(vertices, false);
        dfsUtil(startVertex, visited);
    }

    void dfsUtil(int vertex, vector<bool> &visited)
    {
        visited[vertex] = true;
        cout << vertex << " ";

        for (int neighbor = 0; neighbor < vertices; neighbor++)
        {
            if (adjacencyMatrix[vertex][neighbor] == 1 && !visited[neighbor])
            {
                dfsUtil(neighbor, visited);
            }
        }
    }
};

int main()
{
    int numVertices, numEdges;
    cout << "Enter the number of vertices: ";
    cin >> numVertices;

    Graph graph(numVertices);

    cout << "Enter the number of edges: ";
    cin >> numEdges;

    cout << "Enter the edges (source destination):" << endl;
    for (int i = 0; i < numEdges; i++)
    {
        int source, destination;
        cin >> source >> destination;
        graph.addEdge(source, destination);
    }

    int startVertex;
    cout << "Enter the starting vertex for traversal: ";
    cin >> startVertex;

    cout << "BFS Traversal:" << endl;
    graph.bfsTraversal(startVertex);
    cout << endl;

    cout << "DFS Traversal:" << endl;
    graph.dfsTraversal(startVertex);
    cout << endl;

    return 0;
}