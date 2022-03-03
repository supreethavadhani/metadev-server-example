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
 * class that represents structure of condoneAttendance
 */ 
public class CondoneAttendanceSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 2, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("studentName", 3, DefinedDataTypes.name, null, null, null, "student_name", ColumnType.RequiredData), 
			new DbField("usn", 4, DefinedDataTypes.text, null, null, null, "usn", ColumnType.RequiredData), 
			new DbField("departmentName", 5, DefinedDataTypes.name, null, null, null, "department_name", ColumnType.RequiredData), 
			new DbField("overallAttendance", 6, DefinedDataTypes.text, null, null, null, "overall_attendance", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT institute_id, offered_subject_id, student_id, student_name, usn, department_name, overall_attendance FROM condone_attendance_list";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CondoneAttendanceSchema() {
		this.name = "condoneAttendance";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "condone_attendance_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, this.fields[0], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public CondoneAttendanceData newSchemaData() {
		return new CondoneAttendanceData(this, null);
	}

	@Override
	protected CondoneAttendanceData newSchemaData(final Object[] data) {
		return new CondoneAttendanceData(this, data);
	}

	@Override
	public CondoneAttendanceData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CondoneAttendanceData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CondoneAttendanceData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CondoneAttendanceData) super.parseKeys(json, ctx);
	}

	@Override
	public CondoneAttendanceDataTable newSchemaDataTable() {
		return new CondoneAttendanceDataTable(this, null);
	}

	@Override
	protected CondoneAttendanceDataTable newSchemaDataTable(final Object[][] data) {
		return new CondoneAttendanceDataTable(this, data);
	}

	@Override
	public CondoneAttendanceDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CondoneAttendanceDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
