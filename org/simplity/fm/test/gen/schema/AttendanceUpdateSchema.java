package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.FromToValidation;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of attendanceUpdate
 */ 
public class AttendanceUpdateSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectId", 2, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 3, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("subjectName", 4, DefinedDataTypes.text, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("sectionName", 5, DefinedDataTypes.text, null, null, null, "section_name", ColumnType.OptionalData), 
			new DbField("studentName", 6, DefinedDataTypes.text, null, null, null, "student_name", ColumnType.OptionalData), 
			new DbField("usn", 7, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("totalClasses", 8, DefinedDataTypes.integer, null, null, null, "total_classes", ColumnType.OptionalData), 
			new DbField("currentTotalAttendance", 9, DefinedDataTypes.integer, null, null, null, "current_total_attendance", ColumnType.OptionalData), 
			new DbField("totalAttendance", 10, DefinedDataTypes.integer, null, null, null, null, ColumnType.RequiredData), 
			new DbField("requesterName", 11, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData), 
			new DbField("requesterPhone", 12, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData), 
			new DbField("remarks", 13, DefinedDataTypes.text, null, null, null, null, ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {true, false, true, false, false, false};
	private static final String SELECT = "SELECT subject_register_id, institute_id, subject_id, student_id, subject_name, section_name, student_name, usn, total_classes, current_total_attendance, null, null, null, null FROM attendance_update";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final  String INSERT = "INSERT INTO attendance_update(subject_register_id, institute_id, subject_id, student_id, subject_name, section_name, student_name, usn, total_classes, current_total_attendance, null, null, null, null) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private static final String WHERE = " WHERE subject_register_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE attendance_update SET subject_id= ? , student_id= ? , subject_name= ? , section_name= ? , student_name= ? , usn= ? , total_classes= ? , current_total_attendance= ? , null= ? , null= ? , null= ? , null= ?  WHERE subject_register_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1};
	private static final String DELETE = "DELETE FROM attendance_update";
	private static final IValidation[] VALIDS = {new FromToValidation(0, 0, true, null, "Can not be more than the total classes")
	};

	/**
	 *
	 */
	public AttendanceUpdateSchema() {
		this.name = "attendanceUpdate";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "attendance_update";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(14, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public AttendanceUpdateData newSchemaData() {
		return new AttendanceUpdateData(this, null);
	}

	@Override
	protected AttendanceUpdateData newSchemaData(final Object[] data) {
		return new AttendanceUpdateData(this, data);
	}

	@Override
	public AttendanceUpdateData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (AttendanceUpdateData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public AttendanceUpdateData parseKeys(JsonObject json, IServiceContext ctx) {
		return (AttendanceUpdateData) super.parseKeys(json, ctx);
	}

	@Override
	public AttendanceUpdateDataTable newSchemaDataTable() {
		return new AttendanceUpdateDataTable(this, null);
	}

	@Override
	protected AttendanceUpdateDataTable newSchemaDataTable(final Object[][] data) {
		return new AttendanceUpdateDataTable(this, data);
	}

	@Override
	public AttendanceUpdateDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (AttendanceUpdateDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
