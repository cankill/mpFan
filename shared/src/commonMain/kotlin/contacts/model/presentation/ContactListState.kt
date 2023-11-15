package contacts.model.presentation

import contacts.model.Contact

data class ContactListState(
    val contacts: List<Contact> = listOf(),
    val recentlyAddedContacts: List<Contact> = listOf(),
    val selectedContact: Contact? = null,
    val isContactSheetOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,


)