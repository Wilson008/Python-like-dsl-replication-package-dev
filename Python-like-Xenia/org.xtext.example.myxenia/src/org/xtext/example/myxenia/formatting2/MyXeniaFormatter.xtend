/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.myxenia.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.myxenia.services.MyXeniaGrammarAccess
import xenia.Header
import xenia.Model

class MyXeniaFormatter extends AbstractFormatter2 {
	
	@Inject extension MyXeniaGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (header : model.headers) {
			header.format
		}
		for (entity : model.entities) {
			entity.format
		}
		for (mappedEntity : model.mapped_entities) {
			mappedEntity.format
		}
	}

	def dispatch void format(Header header, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (superSite : header.sites) {
			superSite.format
		}
	}
	
	// TODO: implement for MappedEntity, SiteWithModal, InfoProperty, LinkedProperty
}
