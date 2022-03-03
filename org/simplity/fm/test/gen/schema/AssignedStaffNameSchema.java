package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of assignedStaffName
 */ 
public class AssignedStaffNameSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("staffId", 1, DefinedDataTypes.id, null, null, null, "staff_id", ColumnType.RequiredData), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("email", 3, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_section_id, staff_id, name, email FROM assigned_staff_names";
	private static final int[] SELECT_IDX = {0, 1, 2, 3};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignedStaffNameSchema() {
		this.name = "assignedStaffName";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assigned_staff_names";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(4, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public AssignedStaffNameData newSchemaData() {
		return new AssignedStaffNameData(this, null);
	}

	@Override
	protected AssignedStaffNameData newSchemaData(final Object[] data) {
		return new AssignedStaffNameData(this, data);
	}

	@Override
	public AssignedStaffNameData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignedStaffNameData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignedStaffNameData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignedStaffNameData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignedStaffNameDataTable newSchemaDataTable() {
		return new AssignedStaffNameDataTable(this, null);
	}

	@Override
	protected AssignedStaffNameDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignedStaffNameDataTable(this, data);
	}

	@Override
	public AssignedStaffNameDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignedStaffNameDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
