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
 * class that represents structure of sectionAttendance
 */ 
public class SectionAttendanceSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectSectionId", 2, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("studentId", 3, DefinedDataTypes.id, "0", null, null, "student_id", ColumnType.OptionalData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 5, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("tempUsn", 6, DefinedDataTypes.text, null, null, null, "temp_usn", ColumnType.OptionalData), 
			new DbField("totalClasses", 7, DefinedDataTypes.integer, "0", null, null, "total_classes", ColumnType.OptionalData), 
			new DbField("totalAttendance", 8, DefinedDataTypes.integer, "0", null, null, "total_attendance", ColumnType.OptionalData), 
			new DbField("overallAttendance", 9, DefinedDataTypes.text, null, null, null, "overall_attendance", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, institute_id, subject_section_id, student_id, name, usn, temp_usn, total_classes, total_attendance, overall_attendance FROM section_attendance";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO section_attendance(subject_register_id, institute_id, subject_section_id, student_id, name, usn, temp_usn, total_classes, total_attendance, overall_attendance) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE subject_register_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE section_attendance SET subject_section_id= ? , student_id= ? , name= ? , usn= ? , temp_usn= ? , total_classes= ? , total_attendance= ? , overall_attendance= ?  WHERE subject_register_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
	private static final String DELETE = "DELETE FROM section_attendance";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SectionAttendanceSchema() {
		this.name = "sectionAttendance";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "section_attendance";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public SectionAttendanceData newSchemaData() {
		return new SectionAttendanceData(this, null);
	}

	@Override
	protected SectionAttendanceData newSchemaData(final Object[] data) {
		return new SectionAttendanceData(this, data);
	}

	@Override
	public SectionAttendanceData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SectionAttendanceData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SectionAttendanceData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SectionAttendanceData) super.parseKeys(json, ctx);
	}

	@Override
	public SectionAttendanceDataTable newSchemaDataTable() {
		return new SectionAttendanceDataTable(this, null);
	}

	@Override
	protected SectionAttendanceDataTable newSchemaDataTable(final Object[][] data) {
		return new SectionAttendanceDataTable(this, data);
	}

	@Override
	public SectionAttendanceDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SectionAttendanceDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
