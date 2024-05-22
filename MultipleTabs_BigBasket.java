//package testCase;
//import com.microsoft.playwright.*;
//
//public class MultipleTabs_BigBasket {
//    public static void main(String[] args) {
//        try (Playwright playwright = Playwright.create()) {
//            Browser browser = playwright.firefox().launch();
//            BrowserContext context = browser.newContext();
//            Page page = context.newPage();
//
//            // Navigate to a webpage
//            page.navigate("https://example.com");
//
//            // Specify the selector for the element you want to move
//            String elementSelector = "your-element-selector";
//
//            // Get the element handle
//            ElementHandle element = page.querySelector(elementSelector);
//
//            // Move the element to the right
//            moveElement(element, 100, 0);
//
//            // Move the element down
//            moveElement(element, 0, 100);
//
//            // Move the element to the left
//            moveElement(element, -100, 0);
//
//            // Move the element up
//            moveElement(element, 0, -100);
//
//            // Close the browser
//            browser.close();
//        }
//    }
//
//    private static void moveElement(ElementHandle element, int offsetX, int offsetY) {
//        // Hover over the element to make it interactive
//        element.hover();
//
//        // Drag and drop the element to the specified offset
//        element.dragAndDrop(offsetX, offsetY);
//    }
//}
