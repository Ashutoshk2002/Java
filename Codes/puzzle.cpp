#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class node
{
public:
    int hr;
    vector<vector<int>> sq;
    int r, c;
};

bool comp(node *p1, node *p2)
{
    if (p1->hr < p2->hr)
    {
        return true;
    }
    return false;
}

int level = 0;

void eight(vector<node *> &ol, vector<vector<int>> goal, int r, int c)
{
    if (ol.front()->sq == goal)
    {
        cout << "done";
        exit(0);
    }

    if (c + 1 < 3)
    {
        int count = 0;
        vector<vector<int>> test;
        test = ol.front()->sq;
        swap(test[r][c + 1], test[r][c]);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                cout << test[i][j] << " ";
            }
            cout << endl;
        }
        cout << endl;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (test[i][j] != goal[i][j])
                {
                    count++;
                }
            }
        }
        node *newnode = new node();
        newnode->sq = test;
        newnode->hr = count;
        newnode->r = r;
        newnode->c = c + 1;
        ol.push_back(newnode);
        count = 0;
    }
    if (c - 1 > -1)
    {
        int count = 0;
        vector<vector<int>> test;
        test = ol.front()->sq;
        swap(test[r][c - 1], test[r][c]);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                cout << test[i][j] << " ";
            }
            cout << endl;
        }
        cout << endl;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (test[i][j] != goal[i][j])
                {
                    count++;
                }
            }
        }

        node *newnode = new node();
        newnode->sq = test;
        newnode->hr = count;
        newnode->r = r;
        newnode->c = c - 1;
        ol.push_back(newnode);
        count = 0;
    }

    if (r + 1 < 3)
    {
        int count = 0;
        vector<vector<int>> test;
        test = ol.front()->sq;
        swap(test[r + 1][c], test[r][c]);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                cout << test[i][j] << " ";
            }
            cout << endl;
        }
        cout << endl;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (test[i][j] != goal[i][j])
                {
                    count++;
                }
            }
        }

        node *newnode = new node();
        newnode->sq = test;
        newnode->hr = count;
        newnode->r = r + 1;
        newnode->c = c;
        ol.push_back(newnode);
        count = 0;
    }

    if (r - 1 > -1)
    {
        int count = 0;
        vector<vector<int>> test;
        test = ol.front()->sq;
        swap(test[r - 1][c], test[r][c]);
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                cout << test[i][j] << " ";
            }
            cout << endl;
        }
        cout << endl;

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (test[i][j] != goal[i][j])
                {
                    count++;
                }
            }
        }

        node *newnode = new node();
        newnode->sq = test;
        newnode->hr = count;
        newnode->r = r - 1;
        newnode->c = c;
        ol.push_back(newnode);
        count = 0;
    }

    ol.erase(ol.begin());

    while (!ol.empty() && level <= 50)
    {
        sort(ol.begin(), ol.end(), comp);
        level++;
        eight(ol, goal, ol.front()->r, ol.front()->c);
    }
    cout << "Level " << level << " Heuristic Value : " << ol.front()->hr << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << ol.front()->sq[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;
}

int main()
{

    int count = 0;
    vector<node *> ol;
    vector<vector<int>> start;
    vector<vector<int>> goal;
    vector<int> val;

    int r, c, v;

    cout << "Start : " << endl;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> v;
            val.push_back(v);
        }
        start.push_back(val);
        val.clear();
    }
    cout << endl;
    cout << "Goal : " << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> v;
            val.push_back(v);
        }
        goal.push_back(val);
        val.clear();
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (start[i][j] == 0)
            {
                r = i;
                c = j;
            }
        }
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (start[i][j] != goal[i][j])
            {
                count++;
            }
        }
    }

    node *newnode = new node();
    newnode->sq = start;
    newnode->hr = count;
    ol.push_back(newnode);
    eight(ol, goal, r, c);

    return 0;
}