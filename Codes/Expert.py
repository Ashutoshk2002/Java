# Define the knowledge base
knowledge_base = {
    "TicketHandler": {
        "Software": {
            "Installation and Setup": "Level 1 Support",
            "Software Errors and Bugs": "Level 2 Support",
            "User Account Management": "Application Support",
            "Third-party Integration": "Integration Support",
            "Upgrade and Migration": "Upgrade Support",
            "Data Backup and Recovery": "Data Management Support"
        },
        "Hardware": {
            "Hardware Issues": "Level 1 Support",
            "Device Connectivity": "Hardware Support",
            "Peripheral Problems": "Level 2 Support",
            "Printers and Scanners": "Printing Support",
            "Mobile Devices": "Mobile Support",
            "Conference Room Setup": "AV Support",
            "Inventory Management": "Inventory Support"
        },
        "Networking": {
            "Network Connectivity Problems": "Network Support",
            "DNS Configuration": "Level 1 Support",
            "Firewall and Security": "Security Support",
            "Wireless Connectivity": "Wireless Support",
            "VPN and Remote Access": "Remote Access Support",
            "Load Balancing": "Load Balancing Support",
            "Web Hosting and Domain Names": "Web Hosting Support"
        }
    }
}

# Function to assign a support team based on ticket type and category
def assign_support_team(ticket_type, category):
    if ticket_type in knowledge_base["TicketHandler"]:
        ticket_type_data = knowledge_base["TicketHandler"][ticket_type]
        if category in ticket_type_data:
            return ticket_type_data[category]
        else:
            # Find the closest matching category by looking for the longest common substring
            closest_match = ""
            max_length = 0
            for known_category in ticket_type_data.keys():
                length = len(set(category.lower()) & set(known_category.lower()))
                if length > max_length:
                    max_length = length
                    closest_match = known_category
            if closest_match:
                return f"No support team available for the given category '{category}'. Did you mean '{closest_match}'? If yes try entering '{closest_match}' as the category"
            else:
                return f"No support team available for the given category '{category}'."
    else:
        return f"No support team available for the given ticket type '{ticket_type}'."

# Main program
print("Help Desk Management Expert System")
print("----------------------------------")

while True:
    print("\nSelect an option:")
    print("1. Create a ticket")
    print("2. Exit")

    choice = input("Enter your choice: ")

    if choice == "1":
        ticket_type = input("Enter the ticket type (Software/Hardware/Networking): ")
        category = input("Enter the category: ")

        support_team = assign_support_team(ticket_type, category)
        print("Assigned Support Team:", support_team)

    elif choice == "2":
        break

    else:
        print("Invalid choice. Please try again.")

print("Thank you for using the Help Desk Management Expert System!")
# ------------------------------------------------------------------------------------------------------------------------------------------------

# t converts both the category and known_category strings to lowercase using the lower() method. This ensures case-insensitive comparison.

# The set() function is used to convert each lowercase string into a set of characters. A set is an unordered collection that eliminates duplicate elements.

# The & operator is used to perform the set intersection operation between the two sets of characters. This operation returns a new set containing only the common elements between the two sets.

# The len() function is applied to the resulting set to calculate the number of common characters, which represents the length of the longest common substring between the lowercase versions of category and known_category.

# If the calculated length is greater than the current max_length, it means that the current known_category has a longer common substring with the input category. In that case, max_length is updated with the new value, and the known_category is assigned to closest_match.

# --------------------------
