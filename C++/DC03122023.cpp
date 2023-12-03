#include <math.h>
class Solution
{
public:
    int minTimeToVisitAllPoints(vector<vector<int>> &points)
    {
        int steps = 0, length = 0;
        int point[2], next_point[2];
        for (auto i : points)
        {
            length++;
        }
        for (int x = 0; x < length - 1; x++)
        {
            point[0] = points[x][0];
            point[1] = points[x][1];
            next_point[0] = points[x + 1][0];
            next_point[1] = points[x + 1][1];
            steps += max(abs(next_point[0] - point[0]), abs(next_point[1] - point[1]));
        }
        return steps;
    }
};