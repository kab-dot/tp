package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGEN_GF;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ALLERGEN_LF;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MSHIP_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_MSHIP_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_POINTS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_POINTS_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.item.Item;
import seedu.address.model.person.Person;
/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withAllergens("LF").withPoints("50")
            .withOrders("Cupcake|100|3|2007-12-03T10:15:30").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432").withMembershipPoints("10")
            .withAllergens("GF", "LF").withPoints("70")
            .withOrders("Cookies|100|5|2012-03-21T07:45:01", "Cupcake|150|2|2014-12-11T13:01:02").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").withMembershipPoints("20").withPoints("0")
            .withOrders("Kaya Toast|200|1|2024-01-01T07:00:00").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withMembershipPoints("30").withAllergens("LF")
            .withPoints("100").withOrders("Cheese Tart|300|3|2023-06-30T23:23:23").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").withMembershipPoints("100").withPoints("50")
            .withOrders("Chocolate Waffle|120|2|2023-01-01T13:13:13",
                    "Peanut Butter Waffle|100|3|2023-01-02T14:14:14",
                    "Kaya Waffle|110|1|2023-01-03T15:15:15").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").withMembershipPoints("110")
            .withPoints("20").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").withMembershipPoints("300")
            .withPoints("70").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").withPoints("50").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").withPoints("70").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withMembershipPoints(VALID_MSHIP_AMY)
            .withAllergens(VALID_ALLERGEN_LF).withPoints(VALID_POINTS_AMY).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withMembershipPoints(VALID_MSHIP_BOB)
            .withAllergens(VALID_ALLERGEN_GF, VALID_ALLERGEN_LF).withPoints(VALID_POINTS_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        for (Item item : getTypicalItems()) {
            ab.addItem(item);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(
                new PersonBuilder(ALICE).build(),
                new PersonBuilder(BENSON).build(),
                new PersonBuilder(CARL).build(),
                new PersonBuilder(DANIEL).build(),
                new PersonBuilder(ELLE).build(),
                new PersonBuilder(FIONA).build(),
                new PersonBuilder(GEORGE).build()));
    }

    public static List<Item> getTypicalItems() {
        return new ArrayList<>(Arrays.asList(
                new Item("Cupcake", 100),
                new Item("Cookies", 100),
                new Item("Cupcake", 150),
                new Item("Cheese Tart", 300),
                new Item("Chocolate Waffle", 120),
                new Item("Peanut Butter Waffle", 100),
                new Item("Kaya Waffle", 110),
                new Item("Kaya Toast", 200)));
    }

}
