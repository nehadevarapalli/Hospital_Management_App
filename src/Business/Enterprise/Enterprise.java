/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author nehadevarapalli
 */
public class Enterprise {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"), Service("Service"), Pharmaceutical("Pharmaceutical"), Government("Government");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type, Network network) {
        super(name);
        this.enterpriseType = type;
        this.network = network;
        organizationDirectory = new OrganizationDirectory();
    }
}
