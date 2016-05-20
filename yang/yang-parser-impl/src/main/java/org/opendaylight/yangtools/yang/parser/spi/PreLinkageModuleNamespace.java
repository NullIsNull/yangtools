/*
 * Copyright (c) 2016 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yangtools.yang.parser.spi;

import org.opendaylight.yangtools.yang.model.api.meta.EffectiveStatement;
import org.opendaylight.yangtools.yang.model.api.stmt.ModuleStatement;
import org.opendaylight.yangtools.yang.parser.spi.meta.StatementNamespace;

/**
 * pre-linkage namespace class for storing modules into Yang model storage keyed by module names
 */
public interface PreLinkageModuleNamespace extends
        StatementNamespace<String, ModuleStatement, EffectiveStatement<String, ModuleStatement>> {
}