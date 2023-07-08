package org.exercises.methods;

public class Normalizer {

    public static void main(String[] args) {
        String url = "https://example.com:8080/a/b/c";
        String normalizedUrl = normalize(url);
        System.out.println(normalizedUrl);
    }
    public static String normalize(String url) {
        String protocol = "http";
        String domain = "localhost";
        int port = 80;
        String path = "/";

        if (url != null && !url.isEmpty()) {
            // Split the URL into parts using the ":" delimiter
            String[] parts = url.split(":");

            if (parts.length > 1) {
                // Normalize protocol
                protocol = parts[0];

                if (parts[1].startsWith("//")) {
                    // Remove the leading "//" from the domain part
                    parts[1] = parts[1].substring(2);
                }

                // Split the domain part to extract domain and port
                String[] domainParts = parts[1].split("/");
                domain = domainParts[0];

                if (domainParts.length > 1 && !domainParts[1].isEmpty()) {
                    // Normalize path
                    path = "/" + domainParts[1];
                }

                if (domainParts[0].contains(":")) {
                    // Extract the port from the domain part
                    String[] portParts = domainParts[0].split(":");
                    domain = portParts[0];

                    try {
                        // Normalize port
                        port = Integer.parseInt(portParts[1]);
                    } catch (NumberFormatException e) {
                        // Handle invalid port number
                        System.out.println("Invalid port number");
                    }
                }
            } else {
                // Normalize domain
                domain = url;
            }
        }

        // Construct the normalized URL
        String normalizedUrl = protocol + "://" + domain + ":" + port + path;

        return normalizedUrl;
    }
}







