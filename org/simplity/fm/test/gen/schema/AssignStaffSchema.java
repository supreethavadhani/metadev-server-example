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
 * class that represents structure of assignStaff
 */ 
public class AssignStaffSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectSectionId", 1, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("staffName", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.RequiredData), 
			new DbField("staffId", 3, DefinedDataTypes.id, null, null, null, "staff_id", ColumnType.RequiredData), 
			new DbField("email", 4, DefinedDataTypes.text, null, null, null, "email", ColumnType.OptionalData), 
			new DbField("departmentName", 5, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("isAssigned", 6, DefinedDataTypes.bool, null, null, null, "is_assigned", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT institute_id, subject_section_id, name, staff_id, email, department_name, is_assigned FROM assign_staff_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public AssignStaffSchema() {
		this.name = "assignStaff";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "assign_staff_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[0], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public AssignStaffData newSchemaData() {
		return new AssignStaffData(this, null);
	}

	@Override
	protected AssignStaffData newSchemaData(final Object[] data) {
		return new AssignStaffData(this, data);
	}

	@Override
	public AssignStaffData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AssignStaffData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AssignStaffData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AssignStaffData) super.parseKeys(json, ctx);
	}

	@Override
	public AssignStaffDataTable newSchemaDataTable() {
		return new AssignStaffDataTable(this, null);
	}

	@Override
	protected AssignStaffDataTable newSchemaDataTable(final Object[][] data) {
		return new AssignStaffDataTable(this, data);
	}

	@Override
	public AssignStaffDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AssignStaffDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
