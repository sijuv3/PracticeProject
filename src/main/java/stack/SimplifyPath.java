package stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // Split the input string on "/" as the delimiter and process each portion one by one
        String[] components = path.split("/");

        for (String component : components) {
            // A no-op for a "." or an empty string
            if (component.equals(".") || component.isEmpty()) {
                continue;
            } else if (component.equals("..")) {
                // If the current component is a "..", then we pop an entry from the stack if it's non-empty
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                // Finally, a legitimate directory name, so we add it to our stack
                stack.add(component);
            }
        }

        // Stich together all the directory names together
        StringBuilder result = new StringBuilder();
        for (String dir : stack)
            result.append("/").append(dir);

        return result.length() > 0 ? result.toString() : "/";
    }
}
