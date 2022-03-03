package org.simplity.fm.test.gen.form;

import org.simplity.fm.core.ComponentProvider;
import org.simplity.fm.core.data.Form;
import org.simplity.fm.core.data.Field;
import org.simplity.fm.core.data.LinkedForm;
import org.simplity.fm.core.data.FormDataTable;
import org.simplity.fm.core.data.FormData;
import org.simplity.fm.core.data.SchemaData;
import org.simplity.fm.core.data.SchemaDataTable;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.service.IServiceContext;
import org.simplity.fm.test.gen.DefinedDataTypes;
import org.simplity.fm.test.gen.schema.OfferableSectionData;
import org.simplity.fm.test.gen.schema.OfferableSectionDataTable;
/** class for form offerableSection  */
public class OfferableSectionForm extends Form {
	protected static final String NAME = "offerableSection";
	protected static final String SCHEMA = "offerableSection";
	protected static final  boolean[] OPS = {false, false, false, false, true, false};
/** constructor */
public OfferableSectionForm() {
		this.name = NAME;
		this.schema = ComponentProvider.getProvider().getSchema(SCHEMA);
		this.operations = OPS;
	}

	@Override
	public OfferableSectionFd newFormData() {
		return new OfferableSectionFd(this, null, null, null);
	}

	@Override
	public OfferableSectionFd  parse(final JsonObject json, final boolean forInsert, final IServiceContext ctx) {
		return (OfferableSectionFd)super.parse(json, forInsert, ctx);
	}

	@Override
	public OfferableSectionFd  parseKeys(final JsonObject json, final IServiceContext ctx) {
		return (OfferableSectionFd)super.parseKeys(json, ctx);
	}

	@Override
	public OfferableSectionFdt  parseTable(final JsonArray arr, final boolean forInsert, final IServiceContext ctx, final String tableName) {
		return (OfferableSectionFdt)super.parseTable(arr, forInsert, ctx, tableName);
	}

	@Override
	public OfferableSectionFdt newFormDataTable() {
		return new OfferableSectionFdt(this, null, null, null);
	}

	@Override
	public OfferableSectionFd newFormData(final SchemaData schemaData, final Object[] values, final FormDataTable[] data) {
		return new OfferableSectionFd(this, (OfferableSectionData) schemaData, values, data);
	}

	@Override
	public OfferableSectionFdt newFormDataTable(final SchemaDataTable table, final Object[][] values, FormDataTable[][] linkedData) {
		return new OfferableSectionFdt(this, (OfferableSectionDataTable) table, values, linkedData);
	}
}
