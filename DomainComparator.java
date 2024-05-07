import java.util.Scanner;

public class DomainComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original domain:");
        String originalDomain = scanner.nextLine();

        System.out.println("Enter the domain to compare:");
        String domainToCompare = scanner.nextLine();

        if (areDomainsSimilar(originalDomain, domainToCompare)) {
            System.out.println("Warning: The domains are similar!");
        } else {
            System.out.println("The domains are not similar.");
        }

        scanner.close();
    }

    private static boolean areDomainsSimilar(String domain1, String domain2) {
        // Convert both domains to lowercase for case-insensitive comparison
        domain1 = domain1.toLowerCase();
        domain2 = domain2.toLowerCase();

        // Replace common visually similar characters
        domain1 = domain1.replace('0', 'o');
        domain2 = domain2.replace('0', 'o');
        domain1 = domain1.replace('1', 'i');
        domain2 = domain2.replace('1', 'i');

        // Compare the domains
        return domain1.equals(domain2);
    }
}
