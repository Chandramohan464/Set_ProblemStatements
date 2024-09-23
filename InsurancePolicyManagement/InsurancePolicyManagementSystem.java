package InsurancePolicyManagement;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class InsurancePolicyManagementSystem {
    private Map<String, InsurancePolicy> policies;

    public InsurancePolicyManagementSystem() {
        this.policies = new HashMap<>();
    }

    // Method to add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policies.put(policy.getPolicyNumber(), policy);
    }

    // Method to remove a policy
    public void removePolicy(String policyNumber) {
        policies.remove(policyNumber);
    }

    // Method to display all policies
    public void displayPolicies() {
        if (policies.isEmpty()) {
            System.out.println("No policies available.");
        } else {
            for (InsurancePolicy policy : policies.values()) {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Create some policies
        InsurancePolicy policy1 = new InsurancePolicy("POL001", "Alice Smith", LocalDate.of(2025, 12, 31), "Health", 250.00);
        InsurancePolicy policy2 = new InsurancePolicy("POL002", "Bob Johnson", LocalDate.of(2024, 5, 15), "Auto", 300.00);
        InsurancePolicy policy3 = new InsurancePolicy("POL003", "Charlie Brown", LocalDate.of(2023, 8, 20), "Home", 150.00);

        // Add policies to the system
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);

        // Display all policies
        system.displayPolicies();

        // Remove a policy and display remaining policies
        system.removePolicy("POL002");
        System.out.println("\nAfter removing POL002:");
        system.displayPolicies();
    }
}

