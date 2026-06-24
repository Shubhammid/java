package series;

import java.util.*;

public class Day124_1 {

    static class NestedInteger {
        Integer value;
        List<NestedInteger> list;

        NestedInteger(int value) {
            this.value = value;
        }

        NestedInteger(List<NestedInteger> list) {
            this.list = list;
        }

        boolean isInteger() {
            return value != null;
        }

        int getInteger() {
            return value;
        }

        List<NestedInteger> getList() {
            return list;
        }
    }

    public static int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private static int dfs(List<NestedInteger> nestedList, int depth) {
        int sum = 0;

        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                sum += ni.getInteger() * depth;
            } else {
                sum += dfs(ni.getList(), depth + 1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        List<NestedInteger> nestedList = new ArrayList<>();

        nestedList.add(new NestedInteger(Arrays.asList(
                new NestedInteger(1),
                new NestedInteger(1)
        )));

        nestedList.add(new NestedInteger(2));

        nestedList.add(new NestedInteger(Arrays.asList(
                new NestedInteger(1),
                new NestedInteger(1)
        )));

        System.out.println("Depth Sum: " + depthSum(nestedList));
    }
}