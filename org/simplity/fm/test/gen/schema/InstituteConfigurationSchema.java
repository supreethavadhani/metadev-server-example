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
 * class that represents structure of instituteConfiguration
 */ 
public class InstituteConfigurationSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.id, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("currentSeason", 1, DefinedDataTypes.id, null, null, null, "current_season", ColumnType.RequiredData), 
			new DbField("instituteTypeId", 2, DefinedDataTypes.id, "0", null, null, "institute_type_id", ColumnType.OptionalData), 
			new DbField("autoSubjectRegistration", 3, DefinedDataTypes.bool, "true", null, null, "auto_subject_registration", ColumnType.OptionalData), 
			new DbField("autoRollOverSubjects", 4, DefinedDataTypes.bool, "true", null, null, "auto_roll_over_subjects", ColumnType.OptionalData), 
			new DbField("autoRollOverEnrollment", 5, DefinedDataTypes.bool, "true", null, null, "auto_roll_over_enrollment", ColumnType.OptionalData), 
			new DbField("minAttendanceForEligibility", 6, DefinedDataTypes.integer, "0", null, null, "min_attendance_for_eligibility", ColumnType.OptionalData), 
			new DbField("minAttendanceForExemption", 7, DefinedDataTypes.integer, "0", null, null, "min_attendance_for_exemption", ColumnType.OptionalData), 
			new DbField("answerPacketSeqWidth", 8, DefinedDataTypes.integer, "4", null, null, "answer_packet_seq_width", ColumnType.OptionalData), 
			new DbField("nbrPapersPerPacket", 9, DefinedDataTypes.integer, "10", null, null, "nbr_papers_per_packet", ColumnType.OptionalData), 
			new DbField("minMarksForAutoreval", 10, DefinedDataTypes.integer, "20", null, null, "min_marks_for_autoreval", ColumnType.OptionalData), 
			new DbField("maxMarksForAuotreval", 11, DefinedDataTypes.integer, "30", null, null, "max_marks_for_auotreval", ColumnType.OptionalData), 
			new DbField("acceptableMarksDeviation", 12, DefinedDataTypes.integer, "16", null, null, "acceptable_marks_deviation", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, false, false};
	private static final String SELECT = "SELECT institute_id, current_season, institute_type_id, auto_subject_registration, auto_roll_over_subjects, auto_roll_over_enrollment, min_attendance_for_eligibility, min_attendance_for_exemption, answer_packet_seq_width, nbr_papers_per_packet, min_marks_for_autoreval, max_marks_for_auotreval, acceptable_marks_deviation FROM institute_configurations";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static final  String INSERT = "INSERT INTO institute_configurations(institute_id, current_season, institute_type_id, auto_subject_registration, auto_roll_over_subjects, auto_roll_over_enrollment, min_attendance_for_eligibility, min_attendance_for_exemption, answer_packet_seq_width, nbr_papers_per_packet, min_marks_for_autoreval, max_marks_for_auotreval, acceptable_marks_deviation) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static final String WHERE = " WHERE institute_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE institute_configurations SET current_season= ? , institute_type_id= ? , auto_subject_registration= ? , auto_roll_over_subjects= ? , auto_roll_over_enrollment= ? , min_attendance_for_eligibility= ? , min_attendance_for_exemption= ? , answer_packet_seq_width= ? , nbr_papers_per_packet= ? , min_marks_for_autoreval= ? , max_marks_for_auotreval= ? , acceptable_marks_deviation= ?  WHERE institute_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};
	private static final String DELETE = "DELETE FROM institute_configurations";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public InstituteConfigurationSchema() {
		this.name = "instituteConfiguration";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "institute_configurations";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(13, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public InstituteConfigurationData newSchemaData() {
		return new InstituteConfigurationData(this, null);
	}

	@Override
	protected InstituteConfigurationData newSchemaData(final Object[] data) {
		return new InstituteConfigurationData(this, data);
	}

	@Override
	public InstituteConfigurationData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (InstituteConfigurationData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public InstituteConfigurationData parseKeys(JsonObject json, IServiceContext ctx) {
		return (InstituteConfigurationData) super.parseKeys(json, ctx);
	}

	@Override
	public InstituteConfigurationDataTable newSchemaDataTable() {
		return new InstituteConfigurationDataTable(this, null);
	}

	@Override
	protected InstituteConfigurationDataTable newSchemaDataTable(final Object[][] data) {
		return new InstituteConfigurationDataTable(this, data);
	}

	@Override
	public InstituteConfigurationDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (InstituteConfigurationDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
