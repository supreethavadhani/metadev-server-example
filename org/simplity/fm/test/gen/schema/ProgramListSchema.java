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
 * class that represents structure of programList
 */ 
public class ProgramListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("programId", 0, DefinedDataTypes.id, null, null, null, "program_id", ColumnType.RequiredData), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("departmentId", 2, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.RequiredData), 
			new DbField("programName", 3, DefinedDataTypes.name, null, null, null, "program_name", ColumnType.RequiredData), 
			new DbField("programCode", 4, DefinedDataTypes.code, null, null, null, "program_code", ColumnType.OptionalData), 
			new DbField("departmentName", 5, DefinedDataTypes.text, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("departmentCode", 6, DefinedDataTypes.text, null, null, null, "department_code", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT program_id, institute_id, department_id, program_name, program_code, department_name, department_code FROM program_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ProgramListSchema() {
		this.name = "programList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "program_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[1], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public ProgramListData newSchemaData() {
		return new ProgramListData(this, null);
	}

	@Override
	protected ProgramListData newSchemaData(final Object[] data) {
		return new ProgramListData(this, data);
	}

	@Override
	public ProgramListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ProgramListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ProgramListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ProgramListData) super.parseKeys(json, ctx);
	}

	@Override
	public ProgramListDataTable newSchemaDataTable() {
		return new ProgramListDataTable(this, null);
	}

	@Override
	protected ProgramListDataTable newSchemaDataTable(final Object[][] data) {
		return new ProgramListDataTable(this, data);
	}

	@Override
	public ProgramListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ProgramListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
