/*
 * Copyright (c) 2010-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of Think!Med Clinical Medication Management.
 *
 * Think!Med Clinical Medication Management is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Think!Med Clinical Medication Management is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Think!Med Clinical Medication Management.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.marand.thinkmed.medications.model.impl;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.marand.maf.core.hibernate.entity.AbstractEffectiveCatalogEntity;
import com.marand.thinkmed.medications.model.MedicationIngredient;
import com.marand.thinkmed.medications.rule.MedicationRuleEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Mitja Lapajne
 */
@Entity
public class MedicationIngredientImpl extends AbstractEffectiveCatalogEntity implements MedicationIngredient
{
  private MedicationRuleEnum rule;

  @Override
  @Enumerated(EnumType.STRING)
  public MedicationRuleEnum getRule()
  {
    return rule;
  }

  @Override
  public void setRule(final MedicationRuleEnum rule)
  {
    this.rule = rule;
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);
    tsb.append("rule", rule);
  }
}
