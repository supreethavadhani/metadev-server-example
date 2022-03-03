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
 * class that represents structure of assignableStaff
 */ 
public class AssignableStaffSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("departmentId", 0, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.OptionalData), 
			new DbField("staffId", 1, DefinedDataTypes.id, null, null, null, "staff_id", ColumnType.RequiredData), 
			new DbField("isAssigned", 2, DefinedDataTypes.bool, "false", null, null, "is_assigned", ColumnType.OptionalData), 
			new DbField("name", 3, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("email", 4, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT department_id, staff_id, is_assigned, name, email FROM assignable_staffs";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignableStaffSchema() {
		this.name = "assignableStaff";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assignable_staffs";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public AssignableStaffData newSchemaData() {
		return new AssignableStaffData(this, null);
	}

	@Override
	protected AssignableStaffData newSchemaData(final Object[] data) {
		return new AssignableStaffData(this, data);
	}

	@Override
	public AssignableStaffData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignableStaffData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignableStaffData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignableStaffData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignableStaffDataTable newSchemaDataTable() {
		return new AssignableStaffDataTable(this, null);
	}

	@Override
	protected AssignableStaffDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignableStaffDataTable(this, data);
	}

	@Override
	public AssignableStaffDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignableStaffDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
